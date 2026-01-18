# Herb Cleaning Plugin

A RuneLite plugin that highlights grimy herbs based on whether you have the Herblore level to clean them.

## Features

- **Green outline** on herbs you CAN clean
- **Red outline** on herbs you CANNOT clean
- Works in inventory and bank
- Respects boosted Herblore levels (e.g., from Botanical Pie)
- Fully configurable colors
- Toggle highlights for cleanable/uncleanable herbs separately

## Configuration

| Option | Description |
|--------|-------------|
| Can Clean Color | Color for herbs you can clean (default: Green) |
| Cannot Clean Color | Color for herbs you cannot clean (default: Red) |
| Highlight Cleanable | Show outline on herbs you can clean |
| Highlight Uncleanable | Show outline on herbs you cannot clean |

## Supported Herbs

| Herb | Level Required |
|------|----------------|
| Guam | 3 |
| Marrentill | 5 |
| Tarromin | 11 |
| Harralander | 20 |
| Ranarr | 25 |
| Toadflax | 30 |
| Irit | 40 |
| Avantoe | 48 |
| Kwuarm | 54 |
| Snapdragon | 59 |
| Cadantine | 65 |
| Lantadyme | 67 |
| Dwarf Weed | 70 |
| Torstol | 75 |
| Huasca | 85 |

## Installation

This plugin is available on the [RuneLite Plugin Hub](https://runelite.net/plugin-hub).

1. Open RuneLite
2. Click the wrench icon (Configuration)
3. Click "Plugin Hub" at the bottom
4. Search for "Herb Cleaning"
5. Click Install

## Building from Source

```bash
./gradlew build
```

The plugin JAR will be in `build/libs/`.

## License

BSD 2-Clause License
